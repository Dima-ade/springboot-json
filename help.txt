The project reads a json file from a path (The json is under /resources/expectedValues-url1.json)
specified as argument in the main class, maps the json to Java objects and writes the contents of the objects
to persons database (which is a postgresql database).

@JoinColumn is used in PersonEntity for the links between tables and entities