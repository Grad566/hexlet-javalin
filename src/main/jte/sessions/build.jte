@import org.example.hexlet.NamedRoutes

@template.layout.page(
content = @`
    <form action="${NamedRoutes.sessionsPath()}" method="post">
        <div class="mb-3">
        <label class="form-label">
            Enter your NickName
            <input class="form-control" type="text" placeholder="Nickname" name="nickname">
        </label>
        </div>
        <div class="mb-3">
        <label class="form-label">
            Enter password
            <input class="form-control" type="password" placeholder="Password" name="password">
        </label>
        </div>
        <button type="submit" class="btn btn-primary">Sign In</button>
    </form>
`
)