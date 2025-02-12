package hanz.coding.graphql.domain

class GetCountryUseCase(
    private val countryClient: CountryClient,
) {
    suspend fun execute(code: String): DetailCountry? {
        return countryClient.getCountry(code)
    }
}