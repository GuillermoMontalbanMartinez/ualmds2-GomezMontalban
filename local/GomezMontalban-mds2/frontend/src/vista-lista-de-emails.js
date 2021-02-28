import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-lista-de-emails`
 *
 * VistaListaDeEmails element.
 *
 * @customElement
 * @polymer
 */
class VistaListaDeEmails extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-lista-de-emails';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListaDeEmails.is, VistaListaDeEmails);
