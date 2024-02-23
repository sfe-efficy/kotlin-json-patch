package resources

const val TestData_REMOVE_UNSUPPORTED: String = """
{
    "errors": [
        {
            "op": [{ "op": "remove", "path": "/x/y" }],
            "node": { "x": {} },
            "message": "jsonPatch.noSuchPath"
        }
    ],
    "ops": [
    ]
}
"""