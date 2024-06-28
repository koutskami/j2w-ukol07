[#ftl]
[#--[@c.page title="Příspěvek"]--]
<div>
    <div>
    <h4>${prispevek.title}</h4>
    <p><strong>Autor:</strong> ${prispevek.author}</p>
    <p><strong>Datum: </strong> ${prispevek.getPublished()?date}</p>
    <p>${prispevek.body?no_esc}</p>
    <a href="/">Zpět na hlavní stránku</a>
    </div>
</div>
[#--[/@c.page]--]