<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
<h2>

Hello World!

http://localhost:8080/CrFungus/index.jsp
</h2>
<!-- http://localhost:8080/CrFungus/index.jsp -->
<table>
	<tr>
		<td>
			<input id = "username" name="userName" type= "text"/>
		</td>
	</tr>
	
		<s:property value="message" /> <br/>
 
		<s:form action="Login">
			<s:textfield name="userName" label="UserName" />
			<s:password name="password" label="Password" />
			<s:submit value="login" align="center"/>
		</s:form>
	
</table>



</body>
</html>
