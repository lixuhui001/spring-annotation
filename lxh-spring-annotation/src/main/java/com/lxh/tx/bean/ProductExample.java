package com.lxh.tx.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
@author Robot
*/
public class ProductExample implements Serializable
{

    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Integer limitStart = -1;

    public Integer limitEnd = -1;

	public ColumnName columnName=null;
	
    public ProductExample()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public boolean getDistinct()
    {
        return distinct;
    }

    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    public void setLimitStart(Integer limitStart)
    {
        this.limitStart = limitStart;
    }

    public void setLimitEnd(Integer limitEnd)
    {
        this.limitEnd = limitEnd;
    }

    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        limitStart = -1;
        limitEnd = -1;
    }

    public void setPage(int pageIndex, int pageSize)
    {
        this.setLimitStart((pageIndex - 1) * pageSize);
        this.setLimitEnd(pageSize);
    }

    protected abstract static class GeneratedCriteria  implements Serializable
    {

        private static final long serialVersionUID = 1L;


        protected List<Criterion> criteria;

         protected GeneratedCriteria()
         {
             super();
             this.criteria = new ArrayList<Criterion>();
         }

         public boolean isValid()
         {
             return this.criteria.size() > 0;
         }

         public List<Criterion> getAllCriteria()
         {
             return this.criteria;
         }

         public List<Criterion> getCriteria()
         {
             return this.criteria;
         }

         protected void addCriterion(String condition)
         {
             if (condition == null)
             {
                 throw new RuntimeException("Value for condition cannot be null");
             }
             this.criteria.add(new Criterion(condition));
         }

         protected void addCriterion(String condition, Object value, String property)
         {
             if (value == null)
             {
                 throw new RuntimeException("Value for " + property + " cannot be null");
             }
             this.criteria.add(new Criterion(condition, value));
         }

         protected void addCriterion(String condition, Object value1, Object value2, String property)
         {
             if (value1 == null|| value2 == null)
             {
                 throw new RuntimeException("Between values for " + property + " cannot be null");
             }
             this.criteria.add(new Criterion(condition, value1, value2));
         }
         public Criteria andPidIsNull()
         {
              addCriterion("pid is null");
              return (Criteria) this;
         }

         public Criteria andPidIsNotNull()
         {
              addCriterion("pid  is not null");
              return (Criteria) this;
         }

         public Criteria andPidEqualTo(String value)
         {
              addCriterion("pid  = ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidNotEqualTo(String value)
         {
              addCriterion("pid  <> ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidGreaterThan(String value)
         {
              addCriterion("pid  > ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidGreaterThanOrEqualTo(String value)
         {
              addCriterion("pid  >= ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidLessThan(String value)
         {
              addCriterion("pid  < ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidLessThanOrEqualTo(String value)
         {
              addCriterion("pid  <= ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidLike(String value)
         {
              addCriterion("pid  like ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidNotLike(String value)
         {
              addCriterion("pid  not like ", value, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidIn(List<String> values)
         {
              addCriterion("pid  in ", values, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidNotIn(List<String> values)
         {
              addCriterion("pid  not in ", values, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidBetween(String value1, String value2)
         {
              addCriterion("pid  between ", value1,value2, "pid ");
              return (Criteria) this;
         }

         public Criteria andPidNotBetween(String value1, String value2)
         {
              addCriterion("pid  not between ", value1,value2, "pid ");
              return (Criteria) this;
         }
         public Criteria andProductNameIsNull()
         {
              addCriterion("product_name is null");
              return (Criteria) this;
         }

         public Criteria andProductNameIsNotNull()
         {
              addCriterion("product_name  is not null");
              return (Criteria) this;
         }

         public Criteria andProductNameEqualTo(String value)
         {
              addCriterion("product_name  = ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameNotEqualTo(String value)
         {
              addCriterion("product_name  <> ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameGreaterThan(String value)
         {
              addCriterion("product_name  > ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameGreaterThanOrEqualTo(String value)
         {
              addCriterion("product_name  >= ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameLessThan(String value)
         {
              addCriterion("product_name  < ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameLessThanOrEqualTo(String value)
         {
              addCriterion("product_name  <= ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameLike(String value)
         {
              addCriterion("product_name  like ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameNotLike(String value)
         {
              addCriterion("product_name  not like ", value, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameIn(List<String> values)
         {
              addCriterion("product_name  in ", values, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameNotIn(List<String> values)
         {
              addCriterion("product_name  not in ", values, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameBetween(String value1, String value2)
         {
              addCriterion("product_name  between ", value1,value2, "product_name ");
              return (Criteria) this;
         }

         public Criteria andProductNameNotBetween(String value1, String value2)
         {
              addCriterion("product_name  not between ", value1,value2, "product_name ");
              return (Criteria) this;
         }
         public Criteria andDbSourceIsNull()
         {
              addCriterion("db_source is null");
              return (Criteria) this;
         }

         public Criteria andDbSourceIsNotNull()
         {
              addCriterion("db_source  is not null");
              return (Criteria) this;
         }

         public Criteria andDbSourceEqualTo(String value)
         {
              addCriterion("db_source  = ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceNotEqualTo(String value)
         {
              addCriterion("db_source  <> ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceGreaterThan(String value)
         {
              addCriterion("db_source  > ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceGreaterThanOrEqualTo(String value)
         {
              addCriterion("db_source  >= ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceLessThan(String value)
         {
              addCriterion("db_source  < ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceLessThanOrEqualTo(String value)
         {
              addCriterion("db_source  <= ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceLike(String value)
         {
              addCriterion("db_source  like ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceNotLike(String value)
         {
              addCriterion("db_source  not like ", value, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceIn(List<String> values)
         {
              addCriterion("db_source  in ", values, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceNotIn(List<String> values)
         {
              addCriterion("db_source  not in ", values, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceBetween(String value1, String value2)
         {
              addCriterion("db_source  between ", value1,value2, "db_source ");
              return (Criteria) this;
         }

         public Criteria andDbSourceNotBetween(String value1, String value2)
         {
              addCriterion("db_source  not between ", value1,value2, "db_source ");
              return (Criteria) this;
         }
		public Criteria andCustomSql(String value)
        {
            addCriterion("custom", value, "CUSTOMSQL");
            return (Criteria) this;
        }
    }

	
	
	 public static class ColumnName implements Serializable
    {

        private static final long serialVersionUID = 1L;

        public String quereyColumnNameStr="";		

		public ColumnName addPidColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="pid";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",pid";
            }
            return this;
        }

		public ColumnName addProductNameColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="product_name";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",product_name";
            }
            return this;
        }

		public ColumnName addDbSourceColumn()
        {
            if(this.quereyColumnNameStr.length()==0){
                this.quereyColumnNameStr="db_source";
            }else{
                this.quereyColumnNameStr=this.quereyColumnNameStr+",db_source";
            }
            return this;
        }
	}
	
    public static class Criteria extends GeneratedCriteria implements Serializable
    {

        private static final long serialVersionUID = 1L;

        protected Criteria()
        {
            super();
        }
    }
    public static class Criterion implements Serializable
    {

        private static final long serialVersionUID = 1L;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;
		//�Զ���SQL
		private boolean customValue;

        public boolean isCustomValue()
        {
            return this.customValue;
        }
        public String getCondition()
        {
            return this.condition;
        }

        public Object getValue()
        {
            return this.value;
        }

        public Object getSecondValue()
        {
            return this.secondValue;
        }

        public boolean isNoValue()
        {
            return this.noValue;
        }

        public boolean isSingleValue()
        {
            return this.singleValue;
        }

        public boolean isBetweenValue()
        {
            return this.betweenValue;
        }

        public boolean isListValue()
        {
            return this.listValue;
        }

        public String getTypeHandler()
        {
            return this.typeHandler;
        }

        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
			if ("custom".equals(condition))
            {
                this.customValue = true;
            }
            else if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }
	 public ColumnName createColumnName()
    {
        if (this.columnName == null)
        {
            return this.columnName = new ColumnName();
        }
        return this.columnName;
    }
}
