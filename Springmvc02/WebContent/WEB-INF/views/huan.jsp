<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢妹爱昊哥</h1>
	<!--           pageContext      page域                              

                    request          request域

                    session          session域

                    application       context域 
                    
                    	pageScoep /
                    	 requestScope /
                    	  sessionScope / 
                    	  applicationScope
                    -->
		username:${requestScope.username}<br/>
		password:${requestScope.password}<br/>
		loginMsg:${requestScope.loginMsg }
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>