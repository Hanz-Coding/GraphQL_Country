package hanz.coding.graphql.data

import hanz.coding.CountriesQuery
import hanz.coding.CountryQuery
import hanz.coding.graphql.domain.CountryUI
import hanz.coding.graphql.domain.DetailCountry

fun CountriesQuery.Country.toUI(): CountryUI {
    return CountryUI(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No capital"
    )
}

fun CountryQuery.Country.toDetailUI(): DetailCountry {
    return DetailCountry(
        code = code,
        name = name,
        emoji = emoji,
        capital = capital ?: "No capital",
        currency = currency ?: "No currency",
        languages = languages.map { it.name },
        continent = continent.name
    )
}