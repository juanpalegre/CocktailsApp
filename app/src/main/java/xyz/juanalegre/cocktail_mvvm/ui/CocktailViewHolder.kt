package xyz.juanalegre.cocktail_mvvm.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import xyz.juanalegre.cocktail_mvvm.data.CocktailModel
import xyz.juanalegre.cocktail_mvvm.databinding.RowCocktailBinding

class CocktailViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = RowCocktailBinding.bind(view)

    fun render(cocktail: CocktailModel){
        binding.txtTitle.text = cocktail.cocktailName
        Glide.with(binding.imgDrink.context).load(cocktail.cocktailImage).into(binding.imgDrink)
    }
}