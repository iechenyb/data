package com.orange;
import java.security.spec.X509EncodedKeySpec;
import org.apache.tomcat.util.codec.binary.Base64;
import javax.crypto.Cipher;
import java.security.*;

public class RsaUtil {
    public static final String KEY_ALGORITHM = "RSA";

    public static byte[] encryptByPublicKey(String data, String key)
            throws Exception {
        // 对公钥解密
        byte[] keyBytes = Base64.decodeBase64(key);
        // 取得公钥
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicKey = keyFactory.generatePublic(x509KeySpec);
        // 对数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(data.getBytes());
    }
}