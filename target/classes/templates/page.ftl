<#macro page current pageSize total showPage >
    <#assign totalPage=total%pageSize != 0/>
${totalPage}
    ${(total%pageSize != 0)?string}
    <#--${totalPage = (total%pageSize != 0) ?string((total/pageSize+1)?c , (total/pageSize)?c)}-->
    <#--${totalPage?number}-->
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <#if (current > 1)>
                <li>
                    <a href="#${current-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
            <#else>
                <li class="disabled">
                  <span >
                    <span aria-hidden="true">&laquo;</span>
                  </span>
                </li>
            </#if>
            <#if current==1>
                <#assign start=1/>
            </#if>
            <#assign tru = start+showPage-1>
            <#assign fal = start+showPage-1>
            <#assign end = "0"/>
            ${end = (totalPage%showPage != 0) ?string(tru?string,fal?string)}
            <#list start..end as i>
                <li><a href="#${i}">${i}</a></li>
            </#list>
            <#if (current < totalPage)>
                <li>
                    <a href="#${current+1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            <#else>
                <li class="disabled">
                  <span>
                    <span aria-hidden="true">&raquo;</span>
                  </span>
                </li>
            </#if>
        </ul>
    </nav>
</#macro>