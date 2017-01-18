package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type'", "'extends'", "'{'", "'}'", "'['", "']'", "'string'", "'int'", "'boolean'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_types_0_0= ruleTypeDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_types_0_0= ruleTypeDeclaration ) )* )
            // InternalMyDsl.g:78:2: ( (lv_types_0_0= ruleTypeDeclaration ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_types_0_0= ruleTypeDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_types_0_0= ruleTypeDeclaration )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_types_0_0= ruleTypeDeclaration )
            	    // InternalMyDsl.g:80:4: lv_types_0_0= ruleTypeDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTypesTypeDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleTypeDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"types",
            	    					lv_types_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.TypeDeclaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:100:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMyDsl.g:100:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMyDsl.g:101:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;

             current =iv_ruleTypeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyDsl.g:107:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_properties_5_0= ruleProperty ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:137:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:138:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMyDsl.g:142:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:143:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:143:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:144:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeDeclarationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:160:3: ( (lv_properties_5_0= ruleProperty ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||(LA3_0>=17 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:161:4: (lv_properties_5_0= ruleProperty )
            	    {
            	    // InternalMyDsl.g:161:4: (lv_properties_5_0= ruleProperty )
            	    // InternalMyDsl.g:162:5: lv_properties_5_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getTypeDeclarationAccess().getPropertiesPropertyParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleProperty"
    // InternalMyDsl.g:187:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalMyDsl.g:187:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalMyDsl.g:188:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMyDsl.g:194:1: ruleProperty returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:200:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:201:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:201:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:202:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:202:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyDsl.g:203:4: (lv_type_0_0= ruleType )
            {
            // InternalMyDsl.g:203:4: (lv_type_0_0= ruleType )
            // InternalMyDsl.g:204:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:243:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:243:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:244:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:250:1: ruleType returns [EObject current=null] : ( (this_TypeReference_0= ruleTypeReference | this_PrimitiveType_1= rulePrimitiveType ) ( ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_arrayDimensions_2_0=null;
        Token otherlv_3=null;
        EObject this_TypeReference_0 = null;

        EObject this_PrimitiveType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( ( (this_TypeReference_0= ruleTypeReference | this_PrimitiveType_1= rulePrimitiveType ) ( ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']' )* ) )
            // InternalMyDsl.g:257:2: ( (this_TypeReference_0= ruleTypeReference | this_PrimitiveType_1= rulePrimitiveType ) ( ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']' )* )
            {
            // InternalMyDsl.g:257:2: ( (this_TypeReference_0= ruleTypeReference | this_PrimitiveType_1= rulePrimitiveType ) ( ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']' )* )
            // InternalMyDsl.g:258:3: (this_TypeReference_0= ruleTypeReference | this_PrimitiveType_1= rulePrimitiveType ) ( ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']' )*
            {
            // InternalMyDsl.g:258:3: (this_TypeReference_0= ruleTypeReference | this_PrimitiveType_1= rulePrimitiveType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=17 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:259:4: this_TypeReference_0= ruleTypeReference
                    {

                    				newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_TypeReference_0=ruleTypeReference();

                    state._fsp--;


                    				current = this_TypeReference_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:268:4: this_PrimitiveType_1= rulePrimitiveType
                    {

                    				newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;


                    				current = this_PrimitiveType_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:277:3: ( ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:278:4: ( (lv_arrayDimensions_2_0= '[' ) ) otherlv_3= ']'
            	    {
            	    // InternalMyDsl.g:278:4: ( (lv_arrayDimensions_2_0= '[' ) )
            	    // InternalMyDsl.g:279:5: (lv_arrayDimensions_2_0= '[' )
            	    {
            	    // InternalMyDsl.g:279:5: (lv_arrayDimensions_2_0= '[' )
            	    // InternalMyDsl.g:280:6: lv_arrayDimensions_2_0= '['
            	    {
            	    lv_arrayDimensions_2_0=(Token)match(input,15,FOLLOW_9); 

            	    						newLeafNode(lv_arrayDimensions_2_0, grammarAccess.getTypeAccess().getArrayDimensionsLeftSquareBracketKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeRule());
            	    						}
            	    						addWithLastConsumed(current, "arrayDimensions", lv_arrayDimensions_2_0, "[");
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeReference"
    // InternalMyDsl.g:301:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalMyDsl.g:301:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalMyDsl.g:302:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
             newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;

             current =iv_ruleTypeReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalMyDsl.g:308:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:314:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:315:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:315:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:316:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:316:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:317:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getTypeRefTypeDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:331:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalMyDsl.g:331:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMyDsl.g:332:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:338:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:344:2: ( ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' ) ) ) )
            // InternalMyDsl.g:345:2: ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' ) ) )
            {
            // InternalMyDsl.g:345:2: ( ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' ) ) )
            // InternalMyDsl.g:346:3: ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' ) )
            {
            // InternalMyDsl.g:346:3: ( (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' ) )
            // InternalMyDsl.g:347:4: (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' )
            {
            // InternalMyDsl.g:347:4: (lv_name_0_1= 'string' | lv_name_0_2= 'int' | lv_name_0_3= 'boolean' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:348:5: lv_name_0_1= 'string'
                    {
                    lv_name_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getPrimitiveTypeAccess().getNameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:359:5: lv_name_0_2= 'int'
                    {
                    lv_name_0_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getPrimitiveTypeAccess().getNameIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:370:5: lv_name_0_3= 'boolean'
                    {
                    lv_name_0_3=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getPrimitiveTypeAccess().getNameBooleanKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000E4010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}