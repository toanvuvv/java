package crawJena;

import org.apache.jena.query.ParameterizedSparqlString;

public class GetQuery {
    public GetQuery() {
    }
    private String location="http://dbpedia.org/sparql";
    public String Relocation()
    {
        return this.location;
    }
    public ParameterizedSparqlString getQuery(int d)
    {
        ParameterizedSparqlString queryStr = new ParameterizedSparqlString();
        queryStr.setNsPrefix("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        queryStr.setNsPrefix("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
        queryStr.setNsPrefix("dbo", "http://dbpedia.org/ontology/");
        queryStr.setNsPrefix("dbr", "http://dbpedia.org/resource/");
        queryStr.setNsPrefix("dbc", "http://dbpedia.org/resource/Category:");
        queryStr.setNsPrefix("dbd", "http://dbpedia.org/datatype/");
        queryStr.setNsPrefix("dbp", "http://dbpedia.org/property/");
        queryStr.setNsPrefix("dbt", "http://dbpedia.org/resource/Template:");
        queryStr.setNsPrefix("dct", "http://purl.org/dc/terms/");
        queryStr.setNsPrefix("dc", "http://purl.org/dc/elements/1.1/");
        queryStr.setNsPrefix("yago", "http://dbpedia.org/class/yago/");
        String[] text=new String[50];
        text[0]="\n" +
                "\n" +
                "select distinct ?p ?abstract ?thumb\n" +
                "where {\n" +
                "       {{?p rdf:type dbo:Cave.} UNION {?p rdf:type dbo:NaturalPlace.}}\n" +
                "       {{?p dbo:location dbr:Vietnam.} UNION {?p dbo:country dbr:Vietnam.}}\n" +
                "       ?p rdfs:comment ?abstract.\n" +
                "       ?p dbo:thumbnail ?thumb\n" +
                "       FILTER ( LANG ( ?abstract ) = 'en' )\n" +
                "}\n" +
                "LIMIT 100";
        text[1]="\n" +
                "\n" +
                "select distinct ?p ?abstract ?thumb\n" +
                "where {\n" +
                "       {{?p rdf:type dbo:Food.} UNION  {?p rdf:type yago:WikicatFermentedFoods.}}\n" +
                "       {{?p dbo:location dbr:Vietnam.} UNION {?p dbo:country dbr:Vietnam.}}\n" +
                "       ?p rdfs:comment ?abstract.\n" +
                "       ?p dbo:thumbnail ?thumb\n" +
                "       FILTER ( LANG ( ?abstract ) = 'en' )\n" +
                "}\n" +
                "LIMIT 100";
        text[2]="\n" +
                "\n" +
                "select distinct ?p ?abstract ?thumb\n" +
                "where {\n" +
                "       {?p dct:subject dbc:Festivals_in_Vietnam.}\n" +
                "       ?p rdfs:comment ?abstract.\n" +
                "       ?p dbo:thumbnail ?thumb\n" +
                "       FILTER ( LANG ( ?abstract ) = 'en' )\n" +
                "}\n" +
                "LIMIT 100";
        text[3]="select distinct ?p ?abstract ?thumb\n" +
                "                where {\n" +
                "                       {  {?p rdf:type yago:WikicatCitiesInVietnam.} UNION {?p rdf:type dbo:Location}}\n" +
                "                     {{?p dbo:location dbr:Vietnam.} UNION {?p dbo:country dbr:Vietnam.}}\n" +
                "                      ?p rdfs:comment ?abstract.                \n" +
                "       ?p dbo:thumbnail ?thumb\n" +
                "                       FILTER ( LANG ( ?abstract ) = 'en' )\n" +
                "                }\n" +
                "                LIMIT 100";
        queryStr.append(text[d]);
        return queryStr;
    }
}
