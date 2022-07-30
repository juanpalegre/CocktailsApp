package xyz.juanalegre.cocktail_mvvm.data

class CocktailProvider {

    companion object{

        val cocktailList = listOf<CocktailModel>(
            CocktailModel("https://http2.mlstatic.com/D_NQ_NP_812728-MLA44976416997_022021-O.webp", "Gancia"),
            CocktailModel("https://http2.mlstatic.com/D_NQ_NP_812728-MLA44976416997_022021-O.webp", "Margarita"),
            CocktailModel("https://http2.mlstatic.com/D_NQ_NP_812728-MLA44976416997_022021-O.webp", "Fernet"),
            CocktailModel("https://http2.mlstatic.com/D_NQ_NP_812728-MLA44976416997_022021-O.webp", "Destornillador"),
            CocktailModel("https://http2.mlstatic.com/D_NQ_NP_812728-MLA44976416997_022021-O.webp", "Gin Tonic")
        )
    }
}