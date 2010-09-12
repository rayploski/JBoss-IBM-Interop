<%@ page import="ejbs.*" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.xml.ws.Service" %>

 <html>
	<body>

		<p>Create Web Service Client...<br/>
		<%
			
			try {
				
				Context ctx = new InitialContext();
				Service service = (Service)ctx.lookup("HelloWorld/env/service/HelloWorldService");
				out.println("Found Service... <br/>");
				HelloWorld helloWorld = service.getPort(HelloWorld.class);

				out.println("Found Port... <br/><br/>");
				out.print("<B>Output for HelloWorld = \"" + helloWorld.sayHello() + "\"</B><br/>");
						
			} catch (Exception e) {
				out.println("Oops: " + e.getMessage() + "<br/>");
				e.printStackTrace();
			}
			
		%>	
		</p>
	</body>

</html>