package com.RestAPI.demo.controller;

import com.RestAPI.demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService
{
    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
//                CloudVendor("V1","Sibitalent",
//                "Texas","789");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "updated successfully";
    }
    @DeleteMapping
    public String deleteCloudVendorDetails(){
        this.cloudVendor = null;
        return "deleted successfully";
    }



}
