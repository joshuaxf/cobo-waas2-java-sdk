

# GetStakingEstimationFee201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**poolType** | **StakingPoolType** |  |  [optional] |
|**fee** | [**EstimatedFee**](EstimatedFee.md) |  |  [optional] |
|**validatorPubkeys** | **List&lt;String&gt;** | A list of public keys associated with the Ethereum validators for this staking operation. |  [optional] |
|**coreBtcStakingAddress** | **String** | The P2WSH address generated for this staking operation (only applicable if the estimated fee is for CORE staking). |  [optional] |
|**feeType** | **FeeType** |  |  [optional] |
|**feeAmount** | **String** | The amount of the estimated fee. |  [optional] |
|**tokenId** | **String** | The token ID of the staking fee. |  [optional] |



