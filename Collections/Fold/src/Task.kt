// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allOrderedProducts = customers.flatMap { it.orders }.flatMap { it.products }.toSet()
    return customers.fold(allOrderedProducts, { allOrderedProducts, customer ->
        val customerOrderedProducts = customer.orders.flatMap { it.products }.toSet()
        allOrderedProducts.intersect(customerOrderedProducts)
    }).toSet()
}
