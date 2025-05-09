

# WebhookEventData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data. |  |
|**transactionId** | **UUID** | The transaction ID. |  |
|**coboId** | **String** | The Cobo ID, which can be used to track a transaction. |  [optional] |
|**requestId** | **UUID** | Unique identifier of the token listing request |  |
|**walletId** | **String** | For deposit transactions, this property represents the wallet ID of the transaction destination. For transactions of other types, this property represents the wallet ID of the transaction source. |  |
|**type** | **MPCVaultType** |  |  [optional] |
|**status** | **TokenListingRequestStatus** |  |  |
|**subStatus** | **TransactionSubStatus** |  |  [optional] |
|**failedReason** | **String** | (This property is applicable to approval failures and signature failures only) The reason why the transaction failed. |  [optional] |
|**chainId** | **String** | chain_id of the blockchain where the token exists |  |
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  [optional] |
|**assetId** | **String** | (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. |  [optional] |
|**source** | **TokenListingRequestSource** |  |  |
|**destination** | [**TransactionDestination**](TransactionDestination.md) |  |  |
|**result** | [**TransactionResult**](TransactionResult.md) |  |  [optional] |
|**fee** | [**TransactionFee**](TransactionFee.md) |  |  [optional] |
|**initiator** | **String** | The transaction initiator. |  [optional] |
|**initiatorType** | **TransactionInitiatorType** |  |  |
|**confirmedNum** | **Integer** | The number of confirmations this transaction has received. |  [optional] |
|**confirmingThreshold** | **Integer** | The minimum number of confirmations required to deem a transaction secure. The common threshold is 6 for a Bitcoin transaction. |  [optional] |
|**transactionHash** | **String** | The transaction hash. |  [optional] |
|**blockInfo** | [**TransactionBlockInfo**](TransactionBlockInfo.md) |  |  [optional] |
|**rawTxInfo** | [**TransactionRawTxInfo**](TransactionRawTxInfo.md) |  |  [optional] |
|**replacement** | [**TransactionReplacement**](TransactionReplacement.md) |  |  [optional] |
|**category** | **List&lt;String&gt;** | A custom transaction category for you to identify your transfers more easily. |  [optional] |
|**description** | **String** | The description of the TSS request. |  [optional] |
|**isLoop** | **Boolean** | Whether the transaction was executed as a [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfer. - &#x60;true&#x60;: The transaction was executed as a Cobo Loop transfer. - &#x60;false&#x60;: The transaction was not executed as a Cobo Loop transfer.  |  [optional] |
|**coboCategory** | **List&lt;String&gt;** | The transaction category defined by Cobo. Possible values include:  - &#x60;AutoSweep&#x60;: An auto-sweep transaction. - &#x60;AutoFueling&#x60;: A transaction where Fee Station pays transaction fees to an address within your wallet. - &#x60;AutoFuelingRefund&#x60;: A refund for an auto-fueling transaction. - &#x60;SafeTxMessage&#x60;: A message signing transaction to authorize a Smart Contract Wallet (Safe\\{Wallet\\}) transaction. - &#x60;BillPayment&#x60;: A transaction to pay Cobo bills through Fee Station. - &#x60;BillRefund&#x60;: A refund for a previously made bill payment. - &#x60;CommissionFeeCharge&#x60;: A transaction to charge commission fees via Fee Station. - &#x60;CommissionFeeRefund&#x60;: A refund of previously charged commission fees.  |  [optional] |
|**extra** | **List&lt;String&gt;** | The transaction extra information. |  [optional] |
|**fuelingInfo** | [**TransactionFuelingInfo**](TransactionFuelingInfo.md) |  |  [optional] |
|**createdTimestamp** | **Long** | Timestamp when the request was created (in milliseconds since Unix epoch) |  |
|**updatedTimestamp** | **Long** | Timestamp when the request was last updated (in milliseconds since Unix epoch) |  |
|**tssRequestId** | **String** | The TSS request ID. |  [optional] |
|**sourceKeyShareHolderGroup** | [**SourceGroup**](SourceGroup.md) |  |  [optional] |
|**targetKeyShareHolderGroupId** | **String** | The target key share holder group ID. |  [optional] |
|**addresses** | [**List&lt;AddressesEventDataAllOfAddresses&gt;**](AddressesEventDataAllOfAddresses.md) | A list of addresses. |  [optional] |
|**wallet** | [**WalletInfo**](WalletInfo.md) |  |  [optional] |
|**vaultId** | **String** | The vault ID. |  [optional] |
|**projectId** | **String** | The project ID. |  [optional] |
|**name** | **String** | The vault name. |  [optional] |
|**rootPubkeys** | [**List&lt;RootPubkey&gt;**](RootPubkey.md) |  |  [optional] |
|**chains** | [**List&lt;ChainInfo&gt;**](ChainInfo.md) | The enabled chains. |  |
|**tokens** | [**List&lt;TokenInfo&gt;**](TokenInfo.md) | The enabled tokens. |  |
|**contractAddress** | **String** | Contract address of the token |  |
|**walletType** | **WalletType** |  |  |
|**walletSubtype** | **WalletSubtype** |  |  |
|**token** | [**TokenInfo**](TokenInfo.md) |  |  [optional] |
|**feedback** | **String** | Feedback provided by the admin for rejected requests |  [optional] |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;Transaction&quot; |
| TSSREQUEST | &quot;TSSRequest&quot; |
| ADDRESSES | &quot;Addresses&quot; |
| WALLETINFO | &quot;WalletInfo&quot; |
| MPCVAULT | &quot;MPCVault&quot; |
| CHAINS | &quot;Chains&quot; |
| TOKENS | &quot;Tokens&quot; |
| TOKENLISTING | &quot;TokenListing&quot; |



