/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class CqlResult_t implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CqlResult_t");
  private static final TField ERROR_CODE_FIELD_DESC = new TField("errorCode", TType.I32, (short)1);
  private static final TField ERROR_TXT_FIELD_DESC = new TField("errorTxt", TType.STRING, (short)2);
  private static final TField RESULT_SET_FIELD_DESC = new TField("resultSet", TType.LIST, (short)3);

  public int errorCode;
  public static final int ERRORCODE = 1;
  public String errorTxt;
  public static final int ERRORTXT = 2;
  public List<Map<String,String>> resultSet;
  public static final int RESULTSET = 3;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean errorCode = false;
    public boolean errorTxt = false;
    public boolean resultSet = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(ERRORCODE, new FieldMetaData("errorCode", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    put(ERRORTXT, new FieldMetaData("errorTxt", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    put(RESULTSET, new FieldMetaData("resultSet", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.LIST)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(CqlResult_t.class, metaDataMap);
  }

  public CqlResult_t() {
  }

  public CqlResult_t(
    int errorCode,
    String errorTxt,
    List<Map<String,String>> resultSet)
  {
    this();
    this.errorCode = errorCode;
    this.__isset.errorCode = true;
    this.errorTxt = errorTxt;
    this.__isset.errorTxt = (errorTxt != null);
    this.resultSet = resultSet;
    this.__isset.resultSet = (resultSet != null);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CqlResult_t(CqlResult_t other) {
    __isset.errorCode = other.__isset.errorCode;
    this.errorCode = other.errorCode;
    __isset.errorTxt = other.__isset.errorTxt;
    if (other.errorTxt != null) {
      this.errorTxt = other.errorTxt;
    }
    __isset.resultSet = other.__isset.resultSet;
    if (other.resultSet != null) {
      this.resultSet = other.resultSet;
    }
  }

  @Override
  public CqlResult_t clone() {
    return new CqlResult_t(this);
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    this.__isset.errorCode = true;
  }

  public void unsetErrorCode() {
    this.__isset.errorCode = false;
  }

  // Returns true if field errorCode is set (has been asigned a value) and false otherwise
  public boolean isSetErrorCode() {
    return this.__isset.errorCode;
  }

  public void setErrorCodeIsSet(boolean value) {
    this.__isset.errorCode = value;
  }

  public String getErrorTxt() {
    return this.errorTxt;
  }

  public void setErrorTxt(String errorTxt) {
    this.errorTxt = errorTxt;
    this.__isset.errorTxt = (errorTxt != null);
  }

  public void unsetErrorTxt() {
    this.__isset.errorTxt = false;
  }

  // Returns true if field errorTxt is set (has been asigned a value) and false otherwise
  public boolean isSetErrorTxt() {
    return this.__isset.errorTxt;
  }

  public void setErrorTxtIsSet(boolean value) {
    this.__isset.errorTxt = value;
  }

  public int getResultSetSize() {
    return (this.resultSet == null) ? 0 : this.resultSet.size();
  }

  public java.util.Iterator<Map<String,String>> getResultSetIterator() {
    return (this.resultSet == null) ? null : this.resultSet.iterator();
  }

  public void addToResultSet(Map<String,String> elem) {
    if (this.resultSet == null) {
      this.resultSet = new ArrayList<Map<String,String>>();
    }
    this.resultSet.add(elem);
    this.__isset.resultSet = true;
  }

  public List<Map<String,String>> getResultSet() {
    return this.resultSet;
  }

  public void setResultSet(List<Map<String,String>> resultSet) {
    this.resultSet = resultSet;
    this.__isset.resultSet = (resultSet != null);
  }

  public void unsetResultSet() {
    this.resultSet = null;
    this.__isset.resultSet = false;
  }

  // Returns true if field resultSet is set (has been asigned a value) and false otherwise
  public boolean isSetResultSet() {
    return this.__isset.resultSet;
  }

  public void setResultSetIsSet(boolean value) {
    this.__isset.resultSet = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case ERRORCODE:
      setErrorCode((Integer)value);
      break;

    case ERRORTXT:
      setErrorTxt((String)value);
      break;

    case RESULTSET:
      setResultSet((List<Map<String,String>>)value);
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ERRORCODE:
      return new Integer(getErrorCode());

    case ERRORTXT:
      return getErrorTxt();

    case RESULTSET:
      return getResultSet();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case ERRORCODE:
      return this.__isset.errorCode;
    case ERRORTXT:
      return this.__isset.errorTxt;
    case RESULTSET:
      return this.__isset.resultSet;
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CqlResult_t)
      return this.equals((CqlResult_t)that);
    return false;
  }

  public boolean equals(CqlResult_t that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_errorTxt = true && (this.errorTxt != null);
    boolean that_present_errorTxt = true && (that.errorTxt != null);
    if (this_present_errorTxt || that_present_errorTxt) {
      if (!(this_present_errorTxt && that_present_errorTxt))
        return false;
      if (!this.errorTxt.equals(that.errorTxt))
        return false;
    }

    boolean this_present_resultSet = true && (this.resultSet != null);
    boolean that_present_resultSet = true && (that.resultSet != null);
    if (this_present_resultSet || that_present_resultSet) {
      if (!(this_present_resultSet && that_present_resultSet))
        return false;
      if (!this.resultSet.equals(that.resultSet))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case ERRORCODE:
          if (field.type == TType.I32) {
            this.errorCode = iprot.readI32();
            this.__isset.errorCode = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ERRORTXT:
          if (field.type == TType.STRING) {
            this.errorTxt = iprot.readString();
            this.__isset.errorTxt = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RESULTSET:
          if (field.type == TType.LIST) {
            {
              TList _list40 = iprot.readListBegin();
              this.resultSet = new ArrayList<Map<String,String>>(_list40.size);
              for (int _i41 = 0; _i41 < _list40.size; ++_i41)
              {
                Map<String,String> _elem42;
                {
                  TMap _map43 = iprot.readMapBegin();
                  _elem42 = new HashMap<String,String>(2*_map43.size);
                  for (int _i44 = 0; _i44 < _map43.size; ++_i44)
                  {
                    String _key45;
                    String _val46;
                    _key45 = iprot.readString();
                    _val46 = iprot.readString();
                    _elem42.put(_key45, _val46);
                  }
                  iprot.readMapEnd();
                }
                this.resultSet.add(_elem42);
              }
              iprot.readListEnd();
            }
            this.__isset.resultSet = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
    oprot.writeI32(this.errorCode);
    oprot.writeFieldEnd();
    if (this.errorTxt != null) {
      oprot.writeFieldBegin(ERROR_TXT_FIELD_DESC);
      oprot.writeString(this.errorTxt);
      oprot.writeFieldEnd();
    }
    if (this.resultSet != null) {
      oprot.writeFieldBegin(RESULT_SET_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.MAP, this.resultSet.size()));
        for (Map<String,String> _iter47 : this.resultSet)        {
          {
            oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _iter47.size()));
            for (Map.Entry<String, String> _iter48 : _iter47.entrySet())            {
              oprot.writeString(_iter48.getKey());
              oprot.writeString(_iter48.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CqlResult_t(");
    boolean first = true;

    if (!first) sb.append(", ");
    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("errorTxt:");
    sb.append(this.errorTxt);
    first = false;
    if (!first) sb.append(", ");
    sb.append("resultSet:");
    sb.append(this.resultSet);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

