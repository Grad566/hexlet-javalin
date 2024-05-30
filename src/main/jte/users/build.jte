@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.courses.BuildUserPage
@param BuildUserPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport">
    <title>Sing in</title>
</head>
<body>
@if(page.getErrors() != null)
    <ul>
        @for(var validator : page.getErrors().values())
            @for(var error : validator)
                <li>${error.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif
<form action="${NamedRoutes.usersPath()}" method="post">
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