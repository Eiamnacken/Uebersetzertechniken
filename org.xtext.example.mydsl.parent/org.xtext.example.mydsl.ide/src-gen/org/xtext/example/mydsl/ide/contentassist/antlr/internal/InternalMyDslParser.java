package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'boolean'", "'type'", "'{'", "'}'", "'extends'", "']'", "'['"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__TypesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__TypesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__TypesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__TypesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__TypesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyDsl.g:78:1: entryRuleTypeDeclaration : ruleTypeDeclaration EOF ;
    public final void entryRuleTypeDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTypeDeclaration EOF )
            // InternalMyDsl.g:80:1: ruleTypeDeclaration EOF
            {
             before(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyDsl.g:87:1: ruleTypeDeclaration : ( ( rule__TypeDeclaration__Group__0 ) ) ;
    public final void ruleTypeDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__TypeDeclaration__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__TypeDeclaration__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__TypeDeclaration__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__TypeDeclaration__Group__0 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__TypeDeclaration__Group__0 )
            // InternalMyDsl.g:94:4: rule__TypeDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleProperty"
    // InternalMyDsl.g:103:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleProperty EOF )
            // InternalMyDsl.g:105:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalMyDsl.g:112:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Property__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Property__Group__0 )
            // InternalMyDsl.g:119:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleType EOF )
            // InternalMyDsl.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:137:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Type__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Type__Group__0 )
            // InternalMyDsl.g:144:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeReference"
    // InternalMyDsl.g:153:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTypeReference EOF )
            // InternalMyDsl.g:155:1: ruleTypeReference EOF
            {
             before(grammarAccess.getTypeReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;

             after(grammarAccess.getTypeReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalMyDsl.g:162:1: ruleTypeReference : ( ( rule__TypeReference__TypeRefAssignment ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TypeReference__TypeRefAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TypeReference__TypeRefAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TypeReference__TypeRefAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__TypeReference__TypeRefAssignment )
            {
             before(grammarAccess.getTypeReferenceAccess().getTypeRefAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__TypeReference__TypeRefAssignment )
            // InternalMyDsl.g:169:4: rule__TypeReference__TypeRefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__TypeRefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeReferenceAccess().getTypeRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:178:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( rulePrimitiveType EOF )
            // InternalMyDsl.g:180:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:187:1: rulePrimitiveType : ( ( rule__PrimitiveType__NameAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__PrimitiveType__NameAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__PrimitiveType__NameAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__PrimitiveType__NameAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__PrimitiveType__NameAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__PrimitiveType__NameAssignment )
            // InternalMyDsl.g:194:4: rule__PrimitiveType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "rule__Type__Alternatives_0"
    // InternalMyDsl.g:202:1: rule__Type__Alternatives_0 : ( ( ruleTypeReference ) | ( rulePrimitiveType ) );
    public final void rule__Type__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ruleTypeReference ) | ( rulePrimitiveType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:207:2: ( ruleTypeReference )
                    {
                    // InternalMyDsl.g:207:2: ( ruleTypeReference )
                    // InternalMyDsl.g:208:3: ruleTypeReference
                    {
                     before(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeReference();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( rulePrimitiveType )
                    {
                    // InternalMyDsl.g:213:2: ( rulePrimitiveType )
                    // InternalMyDsl.g:214:3: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives_0"


    // $ANTLR start "rule__PrimitiveType__NameAlternatives_0"
    // InternalMyDsl.g:223:1: rule__PrimitiveType__NameAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) );
    public final void rule__PrimitiveType__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( 'string' ) | ( 'int' ) | ( 'boolean' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:228:2: ( 'string' )
                    {
                    // InternalMyDsl.g:228:2: ( 'string' )
                    // InternalMyDsl.g:229:3: 'string'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNameStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getNameStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( 'int' )
                    {
                    // InternalMyDsl.g:234:2: ( 'int' )
                    // InternalMyDsl.g:235:3: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNameIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getNameIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:240:2: ( 'boolean' )
                    {
                    // InternalMyDsl.g:240:2: ( 'boolean' )
                    // InternalMyDsl.g:241:3: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getNameBooleanKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getNameBooleanKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAlternatives_0"


    // $ANTLR start "rule__TypeDeclaration__Group__0"
    // InternalMyDsl.g:250:1: rule__TypeDeclaration__Group__0 : rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 ;
    public final void rule__TypeDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:254:1: ( rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1 )
            // InternalMyDsl.g:255:2: rule__TypeDeclaration__Group__0__Impl rule__TypeDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0"


    // $ANTLR start "rule__TypeDeclaration__Group__0__Impl"
    // InternalMyDsl.g:262:1: rule__TypeDeclaration__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:1: ( ( 'type' ) )
            // InternalMyDsl.g:267:1: ( 'type' )
            {
            // InternalMyDsl.g:267:1: ( 'type' )
            // InternalMyDsl.g:268:2: 'type'
            {
             before(grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__1"
    // InternalMyDsl.g:277:1: rule__TypeDeclaration__Group__1 : rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 ;
    public final void rule__TypeDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2 )
            // InternalMyDsl.g:282:2: rule__TypeDeclaration__Group__1__Impl rule__TypeDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TypeDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1"


    // $ANTLR start "rule__TypeDeclaration__Group__1__Impl"
    // InternalMyDsl.g:289:1: rule__TypeDeclaration__Group__1__Impl : ( ( rule__TypeDeclaration__NameAssignment_1 ) ) ;
    public final void rule__TypeDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:293:1: ( ( ( rule__TypeDeclaration__NameAssignment_1 ) ) )
            // InternalMyDsl.g:294:1: ( ( rule__TypeDeclaration__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:294:1: ( ( rule__TypeDeclaration__NameAssignment_1 ) )
            // InternalMyDsl.g:295:2: ( rule__TypeDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:296:2: ( rule__TypeDeclaration__NameAssignment_1 )
            // InternalMyDsl.g:296:3: rule__TypeDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__2"
    // InternalMyDsl.g:304:1: rule__TypeDeclaration__Group__2 : rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 ;
    public final void rule__TypeDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3 )
            // InternalMyDsl.g:309:2: rule__TypeDeclaration__Group__2__Impl rule__TypeDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TypeDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__2"


    // $ANTLR start "rule__TypeDeclaration__Group__2__Impl"
    // InternalMyDsl.g:316:1: rule__TypeDeclaration__Group__2__Impl : ( ( rule__TypeDeclaration__Group_2__0 )? ) ;
    public final void rule__TypeDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:320:1: ( ( ( rule__TypeDeclaration__Group_2__0 )? ) )
            // InternalMyDsl.g:321:1: ( ( rule__TypeDeclaration__Group_2__0 )? )
            {
            // InternalMyDsl.g:321:1: ( ( rule__TypeDeclaration__Group_2__0 )? )
            // InternalMyDsl.g:322:2: ( rule__TypeDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getTypeDeclarationAccess().getGroup_2()); 
            // InternalMyDsl.g:323:2: ( rule__TypeDeclaration__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:323:3: rule__TypeDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__3"
    // InternalMyDsl.g:331:1: rule__TypeDeclaration__Group__3 : rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4 ;
    public final void rule__TypeDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4 )
            // InternalMyDsl.g:336:2: rule__TypeDeclaration__Group__3__Impl rule__TypeDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TypeDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__3"


    // $ANTLR start "rule__TypeDeclaration__Group__3__Impl"
    // InternalMyDsl.g:343:1: rule__TypeDeclaration__Group__3__Impl : ( '{' ) ;
    public final void rule__TypeDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( '{' ) )
            // InternalMyDsl.g:348:1: ( '{' )
            {
            // InternalMyDsl.g:348:1: ( '{' )
            // InternalMyDsl.g:349:2: '{'
            {
             before(grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__4"
    // InternalMyDsl.g:358:1: rule__TypeDeclaration__Group__4 : rule__TypeDeclaration__Group__4__Impl rule__TypeDeclaration__Group__5 ;
    public final void rule__TypeDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__TypeDeclaration__Group__4__Impl rule__TypeDeclaration__Group__5 )
            // InternalMyDsl.g:363:2: rule__TypeDeclaration__Group__4__Impl rule__TypeDeclaration__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TypeDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__4"


    // $ANTLR start "rule__TypeDeclaration__Group__4__Impl"
    // InternalMyDsl.g:370:1: rule__TypeDeclaration__Group__4__Impl : ( ( rule__TypeDeclaration__PropertiesAssignment_4 )* ) ;
    public final void rule__TypeDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:374:1: ( ( ( rule__TypeDeclaration__PropertiesAssignment_4 )* ) )
            // InternalMyDsl.g:375:1: ( ( rule__TypeDeclaration__PropertiesAssignment_4 )* )
            {
            // InternalMyDsl.g:375:1: ( ( rule__TypeDeclaration__PropertiesAssignment_4 )* )
            // InternalMyDsl.g:376:2: ( rule__TypeDeclaration__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getTypeDeclarationAccess().getPropertiesAssignment_4()); 
            // InternalMyDsl.g:377:2: ( rule__TypeDeclaration__PropertiesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:377:3: rule__TypeDeclaration__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TypeDeclaration__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTypeDeclarationAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group__5"
    // InternalMyDsl.g:385:1: rule__TypeDeclaration__Group__5 : rule__TypeDeclaration__Group__5__Impl ;
    public final void rule__TypeDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__TypeDeclaration__Group__5__Impl )
            // InternalMyDsl.g:390:2: rule__TypeDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__5"


    // $ANTLR start "rule__TypeDeclaration__Group__5__Impl"
    // InternalMyDsl.g:396:1: rule__TypeDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__TypeDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( '}' ) )
            // InternalMyDsl.g:401:1: ( '}' )
            {
            // InternalMyDsl.g:401:1: ( '}' )
            // InternalMyDsl.g:402:2: '}'
            {
             before(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group__5__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group_2__0"
    // InternalMyDsl.g:412:1: rule__TypeDeclaration__Group_2__0 : rule__TypeDeclaration__Group_2__0__Impl rule__TypeDeclaration__Group_2__1 ;
    public final void rule__TypeDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( rule__TypeDeclaration__Group_2__0__Impl rule__TypeDeclaration__Group_2__1 )
            // InternalMyDsl.g:417:2: rule__TypeDeclaration__Group_2__0__Impl rule__TypeDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group_2__0"


    // $ANTLR start "rule__TypeDeclaration__Group_2__0__Impl"
    // InternalMyDsl.g:424:1: rule__TypeDeclaration__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__TypeDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( 'extends' ) )
            // InternalMyDsl.g:429:1: ( 'extends' )
            {
            // InternalMyDsl.g:429:1: ( 'extends' )
            // InternalMyDsl.g:430:2: 'extends'
            {
             before(grammarAccess.getTypeDeclarationAccess().getExtendsKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__TypeDeclaration__Group_2__1"
    // InternalMyDsl.g:439:1: rule__TypeDeclaration__Group_2__1 : rule__TypeDeclaration__Group_2__1__Impl ;
    public final void rule__TypeDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( rule__TypeDeclaration__Group_2__1__Impl )
            // InternalMyDsl.g:444:2: rule__TypeDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group_2__1"


    // $ANTLR start "rule__TypeDeclaration__Group_2__1__Impl"
    // InternalMyDsl.g:450:1: rule__TypeDeclaration__Group_2__1__Impl : ( ( rule__TypeDeclaration__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__TypeDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ( rule__TypeDeclaration__SuperTypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:455:1: ( ( rule__TypeDeclaration__SuperTypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:455:1: ( ( rule__TypeDeclaration__SuperTypeAssignment_2_1 ) )
            // InternalMyDsl.g:456:2: ( rule__TypeDeclaration__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getTypeDeclarationAccess().getSuperTypeAssignment_2_1()); 
            // InternalMyDsl.g:457:2: ( rule__TypeDeclaration__SuperTypeAssignment_2_1 )
            // InternalMyDsl.g:457:3: rule__TypeDeclaration__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDeclaration__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDeclarationAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalMyDsl.g:466:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalMyDsl.g:471:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalMyDsl.g:478:1: rule__Property__Group__0__Impl : ( ( rule__Property__TypeAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( ( rule__Property__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:483:1: ( ( rule__Property__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:483:1: ( ( rule__Property__TypeAssignment_0 ) )
            // InternalMyDsl.g:484:2: ( rule__Property__TypeAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:485:2: ( rule__Property__TypeAssignment_0 )
            // InternalMyDsl.g:485:3: rule__Property__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalMyDsl.g:493:1: rule__Property__Group__1 : rule__Property__Group__1__Impl ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__Property__Group__1__Impl )
            // InternalMyDsl.g:498:2: rule__Property__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalMyDsl.g:504:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:508:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalMyDsl.g:509:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:509:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalMyDsl.g:510:2: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:511:2: ( rule__Property__NameAssignment_1 )
            // InternalMyDsl.g:511:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalMyDsl.g:520:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalMyDsl.g:525:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalMyDsl.g:532:1: rule__Type__Group__0__Impl : ( ( rule__Type__Alternatives_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( ( ( rule__Type__Alternatives_0 ) ) )
            // InternalMyDsl.g:537:1: ( ( rule__Type__Alternatives_0 ) )
            {
            // InternalMyDsl.g:537:1: ( ( rule__Type__Alternatives_0 ) )
            // InternalMyDsl.g:538:2: ( rule__Type__Alternatives_0 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_0()); 
            // InternalMyDsl.g:539:2: ( rule__Type__Alternatives_0 )
            // InternalMyDsl.g:539:3: rule__Type__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalMyDsl.g:547:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__Type__Group__1__Impl )
            // InternalMyDsl.g:552:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalMyDsl.g:558:1: rule__Type__Group__1__Impl : ( ( rule__Type__Group_1__0 )* ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( ( ( rule__Type__Group_1__0 )* ) )
            // InternalMyDsl.g:563:1: ( ( rule__Type__Group_1__0 )* )
            {
            // InternalMyDsl.g:563:1: ( ( rule__Type__Group_1__0 )* )
            // InternalMyDsl.g:564:2: ( rule__Type__Group_1__0 )*
            {
             before(grammarAccess.getTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:565:2: ( rule__Type__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:565:3: rule__Type__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Type__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalMyDsl.g:574:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalMyDsl.g:579:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalMyDsl.g:586:1: rule__Type__Group_1__0__Impl : ( ( rule__Type__ArrayDimensionsAssignment_1_0 ) ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( ( ( rule__Type__ArrayDimensionsAssignment_1_0 ) ) )
            // InternalMyDsl.g:591:1: ( ( rule__Type__ArrayDimensionsAssignment_1_0 ) )
            {
            // InternalMyDsl.g:591:1: ( ( rule__Type__ArrayDimensionsAssignment_1_0 ) )
            // InternalMyDsl.g:592:2: ( rule__Type__ArrayDimensionsAssignment_1_0 )
            {
             before(grammarAccess.getTypeAccess().getArrayDimensionsAssignment_1_0()); 
            // InternalMyDsl.g:593:2: ( rule__Type__ArrayDimensionsAssignment_1_0 )
            // InternalMyDsl.g:593:3: rule__Type__ArrayDimensionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__ArrayDimensionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getArrayDimensionsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalMyDsl.g:601:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__Type__Group_1__1__Impl )
            // InternalMyDsl.g:606:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalMyDsl.g:612:1: rule__Type__Group_1__1__Impl : ( ']' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ']' ) )
            // InternalMyDsl.g:617:1: ( ']' )
            {
            // InternalMyDsl.g:617:1: ( ']' )
            // InternalMyDsl.g:618:2: ']'
            {
             before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Model__TypesAssignment"
    // InternalMyDsl.g:628:1: rule__Model__TypesAssignment : ( ruleTypeDeclaration ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ruleTypeDeclaration ) )
            // InternalMyDsl.g:633:2: ( ruleTypeDeclaration )
            {
            // InternalMyDsl.g:633:2: ( ruleTypeDeclaration )
            // InternalMyDsl.g:634:3: ruleTypeDeclaration
            {
             before(grammarAccess.getModelAccess().getTypesTypeDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment"


    // $ANTLR start "rule__TypeDeclaration__NameAssignment_1"
    // InternalMyDsl.g:643:1: rule__TypeDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:648:2: ( RULE_ID )
            {
            // InternalMyDsl.g:648:2: ( RULE_ID )
            // InternalMyDsl.g:649:3: RULE_ID
            {
             before(grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__NameAssignment_1"


    // $ANTLR start "rule__TypeDeclaration__SuperTypeAssignment_2_1"
    // InternalMyDsl.g:658:1: rule__TypeDeclaration__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeDeclaration__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:663:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:663:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:664:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationCrossReference_2_1_0()); 
            // InternalMyDsl.g:665:3: ( RULE_ID )
            // InternalMyDsl.g:666:4: RULE_ID
            {
             before(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTypeDeclarationAccess().getSuperTypeTypeDeclarationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__TypeDeclaration__PropertiesAssignment_4"
    // InternalMyDsl.g:677:1: rule__TypeDeclaration__PropertiesAssignment_4 : ( ruleProperty ) ;
    public final void rule__TypeDeclaration__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( ruleProperty ) )
            // InternalMyDsl.g:682:2: ( ruleProperty )
            {
            // InternalMyDsl.g:682:2: ( ruleProperty )
            // InternalMyDsl.g:683:3: ruleProperty
            {
             before(grammarAccess.getTypeDeclarationAccess().getPropertiesPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getTypeDeclarationAccess().getPropertiesPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDeclaration__PropertiesAssignment_4"


    // $ANTLR start "rule__Property__TypeAssignment_0"
    // InternalMyDsl.g:692:1: rule__Property__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( ruleType ) )
            // InternalMyDsl.g:697:2: ( ruleType )
            {
            // InternalMyDsl.g:697:2: ( ruleType )
            // InternalMyDsl.g:698:3: ruleType
            {
             before(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_0"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalMyDsl.g:707:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:712:2: ( RULE_ID )
            {
            // InternalMyDsl.g:712:2: ( RULE_ID )
            // InternalMyDsl.g:713:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Type__ArrayDimensionsAssignment_1_0"
    // InternalMyDsl.g:722:1: rule__Type__ArrayDimensionsAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__Type__ArrayDimensionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:726:1: ( ( ( '[' ) ) )
            // InternalMyDsl.g:727:2: ( ( '[' ) )
            {
            // InternalMyDsl.g:727:2: ( ( '[' ) )
            // InternalMyDsl.g:728:3: ( '[' )
            {
             before(grammarAccess.getTypeAccess().getArrayDimensionsLeftSquareBracketKeyword_1_0_0()); 
            // InternalMyDsl.g:729:3: ( '[' )
            // InternalMyDsl.g:730:4: '['
            {
             before(grammarAccess.getTypeAccess().getArrayDimensionsLeftSquareBracketKeyword_1_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getArrayDimensionsLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getArrayDimensionsLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ArrayDimensionsAssignment_1_0"


    // $ANTLR start "rule__TypeReference__TypeRefAssignment"
    // InternalMyDsl.g:741:1: rule__TypeReference__TypeRefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__TypeRefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:746:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:746:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:747:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeReferenceAccess().getTypeRefTypeDeclarationCrossReference_0()); 
            // InternalMyDsl.g:748:3: ( RULE_ID )
            // InternalMyDsl.g:749:4: RULE_ID
            {
             before(grammarAccess.getTypeReferenceAccess().getTypeRefTypeDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeReferenceAccess().getTypeRefTypeDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTypeReferenceAccess().getTypeRefTypeDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__TypeRefAssignment"


    // $ANTLR start "rule__PrimitiveType__NameAssignment"
    // InternalMyDsl.g:760:1: rule__PrimitiveType__NameAssignment : ( ( rule__PrimitiveType__NameAlternatives_0 ) ) ;
    public final void rule__PrimitiveType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( ( ( rule__PrimitiveType__NameAlternatives_0 ) ) )
            // InternalMyDsl.g:765:2: ( ( rule__PrimitiveType__NameAlternatives_0 ) )
            {
            // InternalMyDsl.g:765:2: ( ( rule__PrimitiveType__NameAlternatives_0 ) )
            // InternalMyDsl.g:766:3: ( rule__PrimitiveType__NameAlternatives_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAlternatives_0()); 
            // InternalMyDsl.g:767:3: ( rule__PrimitiveType__NameAlternatives_0 )
            // InternalMyDsl.g:767:4: rule__PrimitiveType__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000013810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}