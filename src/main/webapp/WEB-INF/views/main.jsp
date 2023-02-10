<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <div>Main</div>
    <hr />
    <div>Spring Security Area</div>
    <sec:authentication property="principal" var="userDetailsBean" />
    <div> userDetails : ${userDetailsBean} </div>
    <%-- 로그인이 필요한 상태 --%>
    <sec:authorize access="isAnonymous()">
        <div>
            <a href="/loginForm">Login</a>
        </div>
        <div>
            <a href="/joinForm">Join Form</a>
        </div>
    </sec:authorize>
    <%-- 로그인이 된 상태 --%>
    <sec:authorize access="isAuthenticated()">
        <div> 
            ID : ${userDetailsBean.username}, Name : ${userDetailsBean.memberName}, <a href="/logoutForm">Logout Form</a>
        </div>
    </sec:authorize>
    <hr />
</body>

</html>