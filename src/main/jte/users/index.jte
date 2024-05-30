@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.courses.UserPage
@param UserPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Searcher</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h1>Поисковик users</h1>

<form action="${NamedRoutes.usersSearchPath()}" method="get">
    <label for="searchTerm">Enter the term:</label>
    <input type="text" id="searchTerm" name="term" value="${page.getTerm()}"/>
    <button type="submit" class="btn btn-primary">Search</button>
</form>
<h2>Result</h2>
<ul>
    @if(page.getUsers().isEmpty())
        <li>Not found</li>
    @else
        @for(var user : page.getUsers())
            <li><a href="courses/${user.getId()}">${user.getName()}</a></li>
        @endfor
    @endif
</ul>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>