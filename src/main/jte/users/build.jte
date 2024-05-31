@import org.example.hexlet.dto.users.BuildUserPage
@param BuildUserPage page

@template.layout.page(
content = @`
    @if(page.getErrors() != null)
        <ul>
            @for(var validator : page.getErrors().values())
                @for(var error : validator)
                    <li>${error.getMessage()}</li>
                @endfor
            @endfor
        </ul>
    @endif

    <form action="/users" method="post">
        <div class="mb-3">
            <label class="form-label">
                Name
                <input class="form-control" type="text" name="name" value="${page.getName()}" />
            </label>
        </div>
        <div class="mb-3">
            <label class="form-label">
                Email
                <input class="form-control" type="email" required name="email" value="${page.getEmail()}" />
            </label>
        </div>
        <div class="mb-3">
            <label class="form-label">
                Password
                <input class="form-control" type="password" required name="password" />
            </label>
        </div>
        <div class="mb-3">
            <label class="form-label">
                Password Confirmation
                <input class="form-control" type="password" required name="passwordConfirmation" />
            </label>
        </div>
        <button type="submit" class="btn btn-primary">Sign Up</button>
    </form>
`
)