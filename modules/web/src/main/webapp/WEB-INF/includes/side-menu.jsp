<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:bundle basename="messages">
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="<c:url value="/resources/dist/img/user2-160x160.jpg"/>" class="img-circle" alt="User Image" />
                </div>
                <div class="pull-left info">
                    <p>Alexander Pierce</p>

                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Search..."/>
              <span class="input-group-btn">
                <button type='submit' name='search' id='search-btn' class="btn btn-flat"><i class="fa fa-search"></i></button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">MAIN NAVIGATION</li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-dashboard"></i>
                        <span>Student</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="add-student"><i class="fa fa-circle-o"></i> Add Student</a></li>
                        <li><a href="#"><i class="fa fa-circle-o"></i> Search Student</a></li>
                        <li><a href="add-student-to-class"><i class="fa fa-circle-o"></i> Assign Student to Class</a></li>
                        <li><a href="view-all-student"><i class="fa fa-circle-o"></i> View All Students</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-dashboard"></i>
                        <span>Class</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="add-grade"><i class="fa fa-circle-o"></i> Add New Class</a></li>
                        <li><a href="#"><i class="fa fa-circle-o"></i> Search Class</a></li>
                        <li><a href="view-all-grade"><i class="fa fa-circle-o"></i> View All Classes</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-files-o"></i>
                        <span>Staff</span>
                        <span class="label label-primary pull-right">4</span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="add-staff"><i class="fa fa-circle-o"></i> Add Staff</a></li>
                        <li><a href="#"><i class="fa fa-circle-o"></i> Search Staff</a></li>
                        <li><a href="view-all-staff"><i class="fa fa-circle-o"></i> View All Staffs</a></li>
                    </ul>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-dashboard"></i>
                        <span>Subject</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="add-subject"><i class="fa fa-circle-o"></i> Add Subject</a></li>
                        <li><a href="#"><i class="fa fa-circle-o"></i> Search Subject</a></li>
                        <li><a href="view-all-subject"><i class="fa fa-circle-o"></i> View All Subjects</a></li>
                    </ul>
                </li>


                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>ATTENDANCE</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>CLASS SCHEDULING</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>GRADING</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>REPORTING</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>TIME TABLE MANAGEMENT</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>LIBRARY MANAGEMENT</span>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="fa fa-th"></i> <span>CLASS SCHEDULING</span>
                    </a>
                </li>

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-share"></i> <span>Multilevel</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
</fmt:bundle>

