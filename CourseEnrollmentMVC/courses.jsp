<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Available Courses</h2>
    <ul>
        <c:forEach var="course" items="${courses}">
            <li>${course.name} - <a href="enroll">Enroll</a></li>
        </c:forEach>
    </ul>
</body>
</html>