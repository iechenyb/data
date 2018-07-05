请求通用格式如下：
<rqs>
	<rq skip="0" uri="/Cash/CashChange">
		{
		  "f": "CashC",
		  "id": "string",
		  "rq": {
		    "pc": ["ag"],
		    "v": "12"
		  }
		}
	</rq>
</rqs>
一个xml代表一个请求，skip代表是否测试该请求标签<rq>，
skip等于1代表跳过测试，否则代表需要测试。
同一个xml文件可以配置多个请求格式相同，但是值不同的请求，
用于测试不同数据的请求的情况。
uri代表当前应用中访问的相对路径。