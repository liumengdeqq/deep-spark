/**
 * 
 */
package com.stratio.deep.extractor.response;

import org.apache.spark.Partition;

import com.stratio.deep.extractor.action.ActionType;

/**
 * @author Óscar Puertas
 * 
 */
public class GetPartitionsResponse extends Response {

  private static final long serialVersionUID = -7728817078374511478L;

  private Partition[] partitions;

  public GetPartitionsResponse() {
    super();
  }

  public GetPartitionsResponse(Partition[] partitions) {
    super(ActionType.GET_PARTITIONS);
    this.partitions = partitions;
  }

  public Partition[] getPartitions() {
    return partitions;
  }
}
