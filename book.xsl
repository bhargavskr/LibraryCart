<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<body>
<table border="2" align="center">
<thead style="color:grey" >book information</thead>
<tr>
    <th style="color:blue">title</th>
    <th style="color:red;font-style:bold;text-transform:capitalize">author</th>
    <th style="color:blue">ISBN</th>
    <th style="color:blue">publisher</th>
    <th style="color:blue">edition</th>
    <th style="color:blue">price</th>
</tr>
<xsl:for-each select="bookinfo/book">
<tr>
    <td style="color:blue"><xsl:value-of select="title" /></td>
    <td style="color:red;font-style:bold;text-transform:capitalize;"><xsl:value-of select="author"/></td>
    <td style="color:blue"><xsl:value-of select="ISBN"/></td> 
    <td style="color:blue"><xsl:value-of select="publisher"/></td>
    <td style="color:blue"><xsl:value-of select="edition"/></td>
    <td style="color:blue"><xsl:value-of select="price"/></td>
</tr>
</xsl:for-each>
</table></body></html>
</xsl:template>
</xsl:stylesheet>

        