<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
	  <title>Struts 2 ActionSupport class extends example</title>
	</head>
	<body>
		<h3>This is an ActionSupport class extends example.</h3>
 
		<s:property value="message" /> <br/>
 
		<s:form action="Login">
			<s:textfield name="userName" label="UserName" />
			<s:password name="password" label="Password" />
			<s:submit value="login" align="center"/>
		</s:form>
 
	</body>
</html>