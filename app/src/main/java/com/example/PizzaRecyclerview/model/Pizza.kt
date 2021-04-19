package com.example.PizzaRecyclerview.model

import com.example.personrecyclerview.R.drawable

data class Pizza(
        var id: Int,
        var name: String? = null,
        var age: Int? = null,
        var imageUrl: Int,
        var price: Int,
        var detail: String,
        var size: List<String>

        )



val snacks = listOf(
        Pizza(
                id = 1,
                name = "Маргарита",
                imageUrl = drawable.margarita,
                price = 299,
                detail = "Томатный соус, сыр моцарелла, сыр пармезан, томаты,\n" +
                        "маслины, базилик."
        , size = listOf("570гр(30см)","105","850гр(40см)","135"))
        ,

        Pizza(
                id = 2,
                name = "Карбонара",
                imageUrl = drawable.carbonara,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf("570 гр(30см)", "135", "870 гр(40см)","165"))

        ,
        Pizza(
                id = 3,
                name = "Четыре сыра",
                imageUrl = drawable.fourcheese,
                price = 299,
                detail = "Сливочный соус, сыр дор блю, сыр чеддер, сыр пармезан, сыр моцарелла.\n",
                size= listOf("600 гр(30см)", "145", "910 гр(40см)","190"))
        ,
        Pizza(
                id = 4,
                name = "Мясная",
                imageUrl = drawable.meat,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf("600 гр(30см)", "135", "920 гр(40см)","170")))
/*        ,
        Pizza(
                id = 5,
                name = "Охотничья",
                imageUrl = drawable.hunt,
                price = 499,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 6,
                name = "Фирменная",
                imageUrl = drawable.firm,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 7,
                name = "Пеперони",
                imageUrl = drawable.peperoni,
                price = 1299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
                ,
        Pizza(
                id = 8,
                name = "Сальмоне",
                imageUrl = drawable.salmone,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 9,
                name = "Гавайская",
                imageUrl = drawable.hawaian,
                price = 549,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 10,
                name = "Салями",
                imageUrl = drawable.salami,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 11,
                name = "Капричоза",
                imageUrl = drawable.caprichiosa,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 12,
                name = "Сицилийская",
                imageUrl = drawable.sicilian,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))
        ,
        Pizza(
                id = 13,
                name = "Цезарь",
                imageUrl = drawable.caesar,
                price = 299,
                detail = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud...",
                size= listOf(SizePizza("30см", 100, "40см"),SizePizza("40см", 200, "40см")))

)*/