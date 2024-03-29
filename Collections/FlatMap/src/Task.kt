// Return all products this customer has ordered
//TODO : Digest more into the diff between map and flatmap
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap { it.products }.toSet()

// Return all products that were ordered by at least one customer
//fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { it.orders }.flatMap { it.products }.toSet()
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { it.getOrderedProducts() }.toSet()//fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { it.orders }.flatMap { it.products }.toSet()

