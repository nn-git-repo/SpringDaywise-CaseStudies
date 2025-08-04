<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h2>Enroll in Course</h2>
    <form action="submitEnrollment" method="post">
        Name: <input type="text" name="name"/><br/>
        Email: <input type="email" name="email"/><br/>
        Course: <input type="text" name="course"/><br/>
        <input type="submit" value="Enroll"/>
    </form>
</body>
</html>