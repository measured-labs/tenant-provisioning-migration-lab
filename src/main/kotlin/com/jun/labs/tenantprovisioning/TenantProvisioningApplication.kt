package com.jun.labs.tenantprovisioning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TenantProvisioningApplication

fun main(args: Array<String>) {
    runApplication<TenantProvisioningApplication>(*args)
}
