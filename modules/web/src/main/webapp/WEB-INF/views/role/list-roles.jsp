<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title></title>
</head>
<body>
<div class="span12">

    <%--    <div class="control-group">
            <div class="controls">
                <div class="alert alert-success">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    <strong>Success!</strong> You have successfully inserted data.
                </div>
            </div>
            <!-- /controls -->
        </div>
        <!-- /control-group -->--%>

    <div class="widget widget-nopad">
        <div class="widget-header"><i class="icon-list-alt"></i>

            <h3><fmt:message key="role.details.label"/></h3>
        </div>
        <!-- /widget-header -->
        <div class="widget-content">
            <div class="widget big-stats-container">
                <div class="widget-content">
                    <c:if test="${!empty roleList}">
                        <table class="table table-bordered">
                            <tr>
                                <th><fmt:message key="common.admin.role.name"/></th>
                                <th><fmt:message key="common.admin.role.description"/></th>
                                <th><fmt:message key="common.admin.action.label"/></th>
                            </tr>
                            <c:forEach items="${roleList}" var="role">
                                <tr>
                                    <td>${role.name}</td>
                                    <td>${role.description}</td>

                                    <td><a href="#" data-toggle="modal">Suspend</a> ,
                                        <a href="#myModal" class="testing" role="button" data-toggle="modal"
                                           data-id="${role.id}">Delete</a> ,
                                        <a href="view-role?id=${role.id}">Modify</a>
                                    </td>
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


    <!-- Modal -->
    <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog"
         aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">X
            </button>
            <h3 id="myModalLabel">WARNING</h3>
        </div>
        <div class="modal-body">
            <p>Are you sure you want to delete this details?</p>
        </div>

        <div class="modal-footer">
            <button class="btn" data-dismiss="modal" aria-hidden="true">No</button>
            <a id="delete-link" class="btn btn-primary" href="#">Yes</a>
        </div>
    </div>
    <%--<a href="#myModal" role="button" class="btn" data-toggle="modal">Launch demo modal</a>--%>
</div>

<script src="<c:url value="/resources/admin-theme/js/jquery-1.7.2.min.js"/>"></script>

<script>
    $(document).on("click", ".testing", function () {
        var roleId = $(this).data('id');
        document.getElementById("delete-link").href = "delete-role-action?id=" + roleId;
        // As pointed out in comments,it is superfluous to have to manually call the modal.
        // $('#myModal').modal('show');
    });
</script>
</body>
</html>