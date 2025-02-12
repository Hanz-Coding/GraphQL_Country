package hanz.coding.graphql.domain

interface CountryClient {
    suspend fun getCountries(): List<CountryUI>
    suspend fun getCountry(code: String): DetailCountry?
}