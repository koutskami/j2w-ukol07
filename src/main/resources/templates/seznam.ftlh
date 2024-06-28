[#ftl]
[#--[@c.page title="Blogové příspěvky"]--]
<h1>Seznam příspěvků</h1>
<div>
    [#list seznam.content]
        [#items as prispevek]
            <div>
                <h4>${prispevek.title}</h4>
                <p>${prispevek.perex?no_esc}</p>
                <p><strong>Autor:</strong> ${prispevek.author}</p>
                <p><strong>Datum: </strong> ${prispevek.getPublished()?date}</p>
                <a href="/${prispevek.slug}">Přečíst</a>
            </div>
        [/#items]
    [/#list]
</div>
[#--[/@c.page]--]