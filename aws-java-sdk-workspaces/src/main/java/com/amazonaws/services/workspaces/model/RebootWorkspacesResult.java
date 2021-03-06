/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of the RebootWorkspaces operation.
 * </p>
 */
public class RebootWorkspacesResult implements Serializable, Cloneable {

    /**
     * An array of structures that represent any WorkSpaces that could not be
     * rebooted.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FailedWorkspaceChangeRequest> failedRequests;

    /**
     * An array of structures that represent any WorkSpaces that could not be
     * rebooted.
     *
     * @return An array of structures that represent any WorkSpaces that could not be
     *         rebooted.
     */
    public java.util.List<FailedWorkspaceChangeRequest> getFailedRequests() {
        if (failedRequests == null) {
              failedRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedWorkspaceChangeRequest>();
              failedRequests.setAutoConstruct(true);
        }
        return failedRequests;
    }
    
    /**
     * An array of structures that represent any WorkSpaces that could not be
     * rebooted.
     *
     * @param failedRequests An array of structures that represent any WorkSpaces that could not be
     *         rebooted.
     */
    public void setFailedRequests(java.util.Collection<FailedWorkspaceChangeRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FailedWorkspaceChangeRequest> failedRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedWorkspaceChangeRequest>(failedRequests.size());
        failedRequestsCopy.addAll(failedRequests);
        this.failedRequests = failedRequestsCopy;
    }
    
    /**
     * An array of structures that represent any WorkSpaces that could not be
     * rebooted.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFailedRequests(java.util.Collection)} or {@link
     * #withFailedRequests(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failedRequests An array of structures that represent any WorkSpaces that could not be
     *         rebooted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebootWorkspacesResult withFailedRequests(FailedWorkspaceChangeRequest... failedRequests) {
        if (getFailedRequests() == null) setFailedRequests(new java.util.ArrayList<FailedWorkspaceChangeRequest>(failedRequests.length));
        for (FailedWorkspaceChangeRequest value : failedRequests) {
            getFailedRequests().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that represent any WorkSpaces that could not be
     * rebooted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failedRequests An array of structures that represent any WorkSpaces that could not be
     *         rebooted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebootWorkspacesResult withFailedRequests(java.util.Collection<FailedWorkspaceChangeRequest> failedRequests) {
        if (failedRequests == null) {
            this.failedRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FailedWorkspaceChangeRequest> failedRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FailedWorkspaceChangeRequest>(failedRequests.size());
            failedRequestsCopy.addAll(failedRequests);
            this.failedRequests = failedRequestsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFailedRequests() != null) sb.append("FailedRequests: " + getFailedRequests() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFailedRequests() == null) ? 0 : getFailedRequests().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RebootWorkspacesResult == false) return false;
        RebootWorkspacesResult other = (RebootWorkspacesResult)obj;
        
        if (other.getFailedRequests() == null ^ this.getFailedRequests() == null) return false;
        if (other.getFailedRequests() != null && other.getFailedRequests().equals(this.getFailedRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public RebootWorkspacesResult clone() {
        try {
            return (RebootWorkspacesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    