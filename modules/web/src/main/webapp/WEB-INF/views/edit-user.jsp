<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
</head>
<body>
<fmt:bundle basename="messages">


<div class="span9">
    <div class="widget widget-nopad">
        <div class="widget-header"><i class="icon-list-alt"></i>

            <h3>USER VIEW</h3>
        </div>
        <!-- /widget-header -->
        <div class="widget-content">
            <div class="widget big-stats-container">
                <div class="widget-content">
                    <h6 class="bigstats">A fully responsive premium quality admin template built on Twitter Bootstrap by
                        <a href="http://www.egrappler.com" target="_blank">EGrappler.com</a>. These are some dummy lines
                        to fill the area.</h6>

                    <c:if  test="${!empty userList}">
                        <table class="table table-bordered">
                            <tr>
                                <th>Full Name</th>
                                <th>Email</th>
                                <th>Msidn</th>
                                <th>Action</th>
                            </tr>
                            <c:forEach items="${userList}" var="user">
                                <tr>
                                    <td>${user.firstName}, ${user.lastName} </td>
                                    <td>${user.email}</td>
                                    <td>${user.username}</td>
                                    <td><a href="delete/${user.userId}">delete</a></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </c:if>

                </div>
                <!-- /widget-content -->

            </div>
        </div>
    </div>
    <!-- /widget -->

</div>
<!-- /span9 -->


<!-- Le javascript
================================================== -->


</fmt:bundle>
</body>
</html>