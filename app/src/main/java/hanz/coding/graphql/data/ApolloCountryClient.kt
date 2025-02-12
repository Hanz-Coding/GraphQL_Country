package hanz.coding.graphql.data

import com.apollographql.apollo3.ApolloClient
import hanz.coding.CountriesQuery
import hanz.coding.CountryQuery
import hanz.coding.graphql.domain.CountryClient
import hanz.coding.graphql.domain.CountryUI
import hanz.coding.graphql.domain.DetailCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient,
) : CountryClient {
    override suspend fun getCountries(): List<CountryUI> {
        return apolloClient.query(
            CountriesQuery()
        ).execute()
            .data?.countries?.map { country -> country.toUI() }
            ?: emptyList()
    }

    override suspend fun getCountry(code: String): DetailCountry? {
        return apolloClient.query(
            CountryQuery(code)
        ).execute()
            .data?.country?.toDetailUI()
    }
}