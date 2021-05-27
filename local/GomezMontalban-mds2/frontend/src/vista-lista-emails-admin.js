import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaListaEmailsAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayout" style="listaEmailsLayout"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-lista-emails-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListaEmailsAdmin.is, VistaListaEmailsAdmin);
