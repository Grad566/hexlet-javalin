@import org.example.hexlet.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
    <div class="col">Name: ${page.getUser().getName()}</div>
    <div class="col">Email: ${page.getUser().getEmail()}</div>
`
)