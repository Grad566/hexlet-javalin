

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport">
    <title>Sing in</title>
</head>
<body>
<form action="/users" method="post">
    <div>
        <label>
            Name
            <input type="text" name="name" />
        </label>
    </div>
    <div>
        <label>
            Email
            <input type="email" required name="email" />
        </label>
    </div>
    <div>
        <label>
            Password
            <input type="password" required name="password">
        </label>
    </div>
    <div>
        <label>
            Confirm password
            <input type="password" required name="passwordConfirmation">
        </label>
    </div>
    <button type="submit">Submit</button>
</form>
</body>
</html>