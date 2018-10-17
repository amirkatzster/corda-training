package net.corda.training.state

import net.corda.core.contracts.ContractState
import net.corda.core.contracts.UniqueIdentifier

interface LinearState : ContractState {

    val linearId: UniqueIdentifier
}