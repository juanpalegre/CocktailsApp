package xyz.juanalegre.cocktail_mvvm.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.juanalegre.cocktail_mvvm.R
import xyz.juanalegre.cocktail_mvvm.data.CocktailModel

class CocktailAdapter(private val cocktailList: List<CocktailModel>): RecyclerView.Adapter<CocktailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CocktailViewHolder(layoutInflater.inflate(R.layout.row_cocktail, parent, false))
    }

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        val item = cocktailList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = cocktailList.size
}