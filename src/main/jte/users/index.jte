@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
content = @`
    <div class="row">
        <table class="table table-striped">
    @for(var user : page.getUsers())
            <tr class="table-info">
                <td><a href="${NamedRoutes.userPath(user.getId())}">${user.getName()}</a></td>
            </tr>
    @endfor
        </table>
    </div>
`
)