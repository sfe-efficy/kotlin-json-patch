package resources

const val TestData_REPLACE: String = """
{
    "errors": [
        {
            "op": [{ "op": "replace", "path": "/a" }],
            "node": { "a": 0 },
            "message": "Missing value field"
        },
        {
            "op": [{ "op": "replace", "path": "/x/y", "value": false }],
            "node": { "x": "a" }
        }
    ],
    "ops": [
        {
            "op": [{ "op": "replace", "path": "", "value": false }],
            "node": { "x": { "a": "b", "y": {} } },
            "expected": false
        },
        {
            "op": [{ "op": "replace", "path": "/x/y", "value": "hello" }],
            "node": { "x": { "a": "b", "y": {} } },
            "expected": { "x": { "a": "b", "y": "hello" } }
        },
        {
            "op": [{ "op": "replace", "path": "/0/2", "value": "x" }],
            "node": [ [ "a", "b", "c"], "d", "e" ],
            "expected": [ [ "a", "b", "x" ], "d", "e" ]
        },
        {
            "op": [{ "op": "replace", "path": "/x/0", "value": null }],
            "node": { "x": [ "y", "z" ], "foo": "bar" },
            "expected": { "x": [ null, "z" ], "foo": "bar" }
        }
    ]
}
"""