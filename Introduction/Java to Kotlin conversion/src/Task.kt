fun toJSON(collection: Collection<Int>): String = collection.joinToString(prefix = "[", postfix = "]")
