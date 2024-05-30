@import org.example.hexlet.NamedRoutes

@template.layout.page(
content = @`
    <form action="${NamedRoutes.sessionsPath()}" method="post">
        <label>
            Enter your NickName
            <input type="text" placeholder="Nickname" name="nickname">
        </label>
        <label>
            Enter password
            <input type="password" placeholder="Password" name="password">
        </label>
        <input type="submit">
    </form>
`
)