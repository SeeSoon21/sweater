<#import "parts/common.ftlh" as c>
<@c.page>
<h2>User editor</h2>

<form action="/user" method="post">
    <label>username: <input type="text" name="username" value="${user.username}"></label> <br/>
    <label>password: <input type="password" name="password"></label>
    <#list roles as role>
    <div>
        <!-- если поле ролей юзера содержит "какие-то" роли, отметить их флажком. -->
        <label><input type="checkbox" name="${role}" ${user.roles?seq_contains(role)?string("checked", "")}>${role}</label>
    </div>
    </#list>
    <input type="hidden" value="${user.id}" name="userId">
    <input type="hidden" value="${_csrf.token}" name="_csrf">
    <button type="submit">Save</button>
</form>
</@c.page>

