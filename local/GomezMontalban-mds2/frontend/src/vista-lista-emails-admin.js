import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-lista-emails-admin`
 *
 * VistaListaEmailsAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaListaEmailsAdmin extends PolymerElement {

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
        return 'vista-lista-emails-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListaEmailsAdmin.is, VistaListaEmailsAdmin);
